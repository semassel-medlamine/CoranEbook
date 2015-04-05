package com.oukache.coranebook.core;

/**
 * Created by Oukache on 05/04/2015.
 */
public interface ICoranTaskResponse<T> {
	public void onSuccess(T result);
	public void onFailure(Exception e);
}
