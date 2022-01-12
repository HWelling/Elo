package de.welling.elo.testcontainers;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.MongoDBContainer;

public class EloPersonMongoDBcontainer extends GenericContainer<MongoDBContainer> {
	private static final int PORT = 27017;

	public EloPersonMongoDBcontainer(final String image) {
		super(image);
		this.addExposedPort(PORT);
	}

}
