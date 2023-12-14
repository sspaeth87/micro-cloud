
package de.xplugin.payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;


@MicronautTest
class ClusterDemoTest
{
	
	@Inject
	EmbeddedApplication<?> application;
	
	@Test
	void testItWorks()
	{
		Assertions.assertTrue(this.application.isRunning());
	}
	
}
