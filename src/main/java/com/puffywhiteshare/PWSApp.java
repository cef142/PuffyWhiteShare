package com.puffywhiteshare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.yaml.snakeyaml.Yaml;

public class PWSApp {
	static private Logger logger = Logger.getLogger(PWSApp.class);
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		CloudBucket cloud = new CloudBucket();
		logger.info("Test my output bitches");
		Yaml y = new Yaml();
		File f = new File("Playing.yml");
		FileInputStream fis = new FileInputStream(f);
		Map m = (Map) y.load(fis);
		
		Long startFiles = System.currentTimeMillis();
		Iterator<File> fileIterator = FileUtils.iterateFiles(new File("/Users/chad/Pictures/."), null, true);
		do {
			File file = fileIterator.next();
			cloud.add(file);
		} while(fileIterator.hasNext());
		Long endFiles = System.currentTimeMillis();
		System.out.println("Files processing took " + ((endFiles - startFiles)));
		
		Long startSer = System.currentTimeMillis();
		String filename = "cloud.ser";
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try
		{
		    fos = new FileOutputStream(filename);
		    out = new ObjectOutputStream(fos);
		    out.writeObject(cloud);
		    out.close();
		}
		catch(IOException ex)
		{
		    ex.printStackTrace();
		}
		Long endSer = System.currentTimeMillis();
		System.out.println("Files processing took " + ((endSer - startSer)));
		
		logger.info(" Size = " + FileUtils.byteCountToDisplaySize(cloud.getSize()));
		logger.info("Count = " + cloud.getCount());
		
		/*
		Set<String> buckets = m.keySet();
		System.out.println(m.toString());
		for(String bucket : buckets) {
			logger.info("Bucket = " + bucket);
			logger.info("Folders = " + m.get(bucket));
			List<Object> folders = (List<Object>) m.get(bucket);
			for(Object folder : folders) {
				if(folder instanceof String) {
					logger.info("Folder Root = " + folder);
				} else if(folder instanceof Map) {
					logger.info("Folder Map = " + folder);
				}
			}
			BlockingQueue<File> fileFeed = new ArrayBlockingQueue<File>(10);
			
			Map folderMap = (Map) m.get(bucket);
			Set<String> folders = folderMap.entrySet();
			for(String folder : folders) {
				logger.info("Folder = " + folder);
			}
			
		}
		*/
	}

}
