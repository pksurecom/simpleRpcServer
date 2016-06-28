package com.rpc.connector;

/**
 * Created by shocklee on 16/6/26.
 */
public interface RemoteServer {

    public void start();
    public void stop();
    public int listenPort();

    public void regesterRequestProcessor(RequestProcessor processor) ;

}
