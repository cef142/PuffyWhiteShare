/*
Copyright (C) 2011 Chad Frederick

     This program is free software: you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation, either version 3 of the License, or (at
     your option) any later version.

     This program is distributed in the hope that it will be useful, but
     WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
     General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program.  If not, see http://www.gnu.org/licenses/.
*/
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
