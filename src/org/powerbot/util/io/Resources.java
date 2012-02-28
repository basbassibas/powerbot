package org.powerbot.util.io;

import org.powerbot.util.Configuration;

import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Resources {
	public static class Paths {
		public static final String ROOT = "resources";
		public static final String ROOT_IMG = ROOT + "/images";
		public static final String ICON = ROOT_IMG + "/icon.png";
		public static final String ARROWS = ROOT_IMG + "/arrows.png";
		public static final String VERSION = ROOT + "/version.txt";
	}


	public static URL getResourceURL(final String path) throws MalformedURLException {
		return Configuration.FROMJAR ? Configuration.class.getResource("/" + path) : new File(path).toURI().toURL();
	}

	public static Image getImage(final String resource) {
		try {
			return Toolkit.getDefaultToolkit().getImage(getResourceURL(resource));
		} catch (final Exception ignored) {
		}
		return null;
	}
}
