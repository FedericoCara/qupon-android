package com.globalis.network;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

public abstract class HttpTask extends AsyncTask<String, Void, Response>  {
	private HttpRequest request;
	private Context context;
	private ProgressDialog dialog;
	private String error;	
	
	public HttpTask set(Context context, HttpRequest request) {
		this.context = context;
		this.request = request;
		return this;
	}
	
	@Override
	protected void onPreExecute() {	
		super.onPreExecute();
		dialog = new ProgressDialog(context);
		dialog.setMessage("Loading...");
		dialog.show();			
	}
	
	@Override
	protected Response doInBackground(String... params) {	
		try {
			Response response = request.execute();				
			return response;
			
		} catch (Exception e) {
			error = e.getMessage();
			cancel(true);
		}
		
		return null;
	}
	
	@Override
	protected void onPostExecute(Response result) {	
		super.onPostExecute(result);
		dialog.dismiss();
		doWork(result);
		if(error != null) {
			Toast.makeText(context, error, Toast.LENGTH_LONG).show();
		}
	}
	
	public abstract void doWork(Response response);
}