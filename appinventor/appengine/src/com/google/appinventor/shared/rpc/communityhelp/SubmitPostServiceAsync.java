// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2013 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.shared.rpc.communityhelp;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SubmitPostServiceAsync extends RemoteService
{
    /**
     * Submits a post
     */
    public void submitPost(String userId, String username, String title, String description, int categoryId, boolean attachProject, String projectId, AsyncCallback<String> callback);

    /**
     * uploads a file to Community Server
     */
    public void uploadFile(String userId, String username, String title, String description, int categoryId, boolean attachProject, String projectId, AsyncCallback<String> callback);

    /**
     * Fetches all public categories from discourse
     */
    public void getDiscourseCategories(AsyncCallback<String> callback);


    /**
     * Fetch all similar topics from discourse 
     */
    public void getSimilarTopics(String query, AsyncCallback<String> callback);

}
