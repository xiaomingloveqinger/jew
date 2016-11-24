package com.jew.test.model.base;

import com.jew.plugin.activeRecord.Model;
import com.jew.plugin.activeRecord.IBean;

/**
 * Generated by Jew, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTag<M extends BaseTag<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}
	public void setTagName(java.lang.String tagName) {
		set("tagName", tagName);
	}

	public java.lang.String getTagName() {
		return get("tagName");
	}
	public void setBlogId(java.lang.Integer blogId) {
		set("blog_id", blogId);
	}

	public java.lang.Integer getBlogId() {
		return get("blog_id");
	}
	public void setTagUrl(java.lang.String tagUrl) {
		set("tagUrl", tagUrl);
	}

	public java.lang.String getTagUrl() {
		return get("tagUrl");
	}
}