package com.lyz.cabox.mogoDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

@Repository("noSqlBaseDao")
public class NoSqlBaseDao implements INoSqlBaseDao {
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void query() {

		// Point point = new Point(117.1900, 39.1199);
		// Sphere sphere = new Sphere(point, 6.2137119 / 3963.2);
		// List<Order> positions = mongoTemplate.find(new
		// Query(Criteria.where("coordinates").within(sphere)),
		// Order.class);
		// System.out.println(positions);
		// Point point = new Point(117.1900, 39.1199);
		// Distance distance = new Distance(20, Metrics.KILOMETERS);
		// Circle circle = new Circle(point, distance);
		// Criteria cc = Criteria.where("coordinates").withinSphere(circle);
		// Query query = new Query(cc);
		// List<Order> order = mongoTemplate.find(query, Order.class);
		// System.out.println(order);

		// Point location = new Point(117.190002, 39.1199);
		// NearQuery query = NearQuery.near(location).num(30).query(new Query())
		// .maxDistance(new Distance(20, Metrics.KILOMETERS));
		// GeoResults<Order> geoResults = mongoTemplate.geoNear(query,
		// Order.class);
		// System.out.println(geoResults);

		// Point point = new Point(31.7297397, 31.7297397);
		// Circle circle = new Circle(point, 20);
		// List<Order> result = mongoTemplate.find(new
		// Query(Criteria.where("location").within(circle)), Order.class,
		// "location");
		// System.out.println(result);
		// mongoTemplate.findAll(Order.class);
		// Query query = new Query();
		// Criteria criteria = Criteria.where("age").is("20");
		// query.addCriteria(criteria);
		// Order c = mongoTemplate.findOne(query, Order.class);
		// System.out.println(c);

		DBObject query = new BasicDBObject();
		query.put("location",
				new BasicDBObject("$near", new BasicDBObject("$geometry",
						new BasicDBObject("type", "Point").append("coordinates", new Double[] { 117.190002, 39.1199 }))
								.append("$maxDistance", 1000)));
		Query quer1 = new BasicQuery(query);

		List<Order> order = mongoTemplate.find(quer1, Order.class);

		System.out.println(order);

	}
}
