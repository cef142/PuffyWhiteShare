package com.puffywhiteshare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class CloudBucket implements Serializable {
	static private Logger logger = Logger.getLogger(CloudBucket.class);
	
	String localPath;
	List<CloudObject> objects = new ArrayList<CloudObject>();
	Long size=0L;
	Integer count=0;
	
	public CloudObject find(File f) {
		return null;
	}
	
	public void add(File f) throws FileNotFoundException, IOException {
		Date lastModified = new Date(f.lastModified());
		String md5 = "AAAA AAAA AAAA AAAA"; //DigestUtils.md5Hex(new FileInputStream(f));
		String path = f.getAbsolutePath();
		size += f.length();
		count++;
		CloudObject obj = new CloudObject(path, md5, lastModified);
		logger.info("CloudObject created: path[" + path + "]:md5[" + md5 + "]:last[" + lastModified + "]");
		objects.add(obj);
		
	}

	public Long getSize() {
		return size;
	}

	public Integer getCount() {
		return count;
	}
}
