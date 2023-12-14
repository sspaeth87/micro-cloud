package de.xplugin.payment.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import de.xplugin.payment.storage.MicroStream;

@Controller("/")
public class ExampleController
{
	@Get
	public String root()
	{
		return "Data root, created @ " + MicroStream.root().getData();
	}
}
