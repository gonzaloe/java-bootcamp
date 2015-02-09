package demo;

import java.net.UnknownHostException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class TestMyMongo {

	public static void main(String[] args) throws UnknownHostException {
		MongoClient mongoClient = new MongoClient("localhost" , 27017);
		
		DB dB = mongoClient.getDB("newdatabase");
		
		//Point 2
		DBCollection dBCollection = dB.getCollection("testData");
		BasicDBObject query = new BasicDBObject("i", new BasicDBObject("$gt", 50));
		DBCursor cursor = dBCollection.find();
		
		cursor = dBCollection.find(query);
		try {
		    while (cursor.hasNext()) {
		        System.out.println(cursor.next());
		    }
		} finally {
		    cursor.close();
		}
		
		//Point 3
		dBCollection = dB.getCollection("Course");
		query = new BasicDBObject("last_name", "Espeche");
		cursor = dBCollection.find();
		
		cursor = dBCollection.find(query);
		try {
		    while (cursor.hasNext()) {
		        System.out.println(cursor.next());
		    }
		} finally {
		    cursor.close();
		}
		
		//Point 4
		for (int i=0; i < dBCollection.getCount(); i++) {
		    dBCollection.insert(new BasicDBObject("has_finished", 0));
		}
	}

}
