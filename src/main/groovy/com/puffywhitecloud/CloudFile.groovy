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
package com.puffywhitecloud
/**
 * User: cfrederick
 * Date: 2/24/11
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */
class CloudFile {
    def File f
    def String hash
    def String path
    def timestamp
    def url

    public String toString ( ) {
        return "File{" +
        "f=" + f +
        ", hash='" + hash + '\'' +
        ", path='" + path + '\'' +
        ", timestamp=" + timestamp + '\'' +
        ", url='" + path +
        '}' ;
    }
}