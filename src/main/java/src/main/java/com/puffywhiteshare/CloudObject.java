package com.puffywhiteshare;

import java.io.Serializable;
import java.util.Date;

public class CloudObject implements Serializable {
	String localPath;
	String remotePath;
	String hash;
	Date lastModified;
	
	public CloudObject(String relativePath, String hash, Date lastModified) {
		super();
		this.localPath = relativePath;
		this.hash = hash;
		this.lastModified = lastModified;
	}
	
	public String getLocalPath() {
		return localPath;
	}
	public String getRemotePath() {
		return remotePath;
	}
	public String getHash() {
		return hash;
	}
	public Date getLastModified() {
		return lastModified;
	}
}
