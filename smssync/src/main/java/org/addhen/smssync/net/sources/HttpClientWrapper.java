package org.addhen.smssync.net.sources;

import org.addhen.smssync.net.HttpMediaType;
import org.addhen.smssync.net.SyncScheme;
import org.apache.http.NameValuePair;

import java.io.Reader;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Http client source
 */
public interface HttpClientWrapper {

    void setHeader(String name, String value);

    int responseCode();

    String getResponseBody();

    String getErrorMessage();

    void setRequestParameter(String name, String value);

    ArrayList getParams();

    void setRequestBody(HttpMediaType mediaType, ArrayList<NameValuePair> body) throws Exception;

    void setRequestBody(HttpMediaType mediaType, String body) throws Exception;

    void execute() throws Exception;

    void debug(Exception e);

}
