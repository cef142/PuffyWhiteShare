package com.puffywhitecloud
/**
 * Created by IntelliJ IDEA.
 * User: chad
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