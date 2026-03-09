package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.freight.template.list.query'.
 * Contains the list of freight templates.
 */
public class BgFreightTemplateListQueryResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * List of freight templates.
	 */
	private List<TemplateInfo> templateList;
		
	public BgFreightTemplateListQueryResponse() {
		this.templateList = new ArrayList<>();
	}
	
	/**
	 * @return the list of freight templates
	 */
	public List<TemplateInfo> getTemplateList() {
		return templateList;
	}
	
	/**
	 * @param templateList the list of freight templates
	 * @return this response object for method chaining
	 */
	public BgFreightTemplateListQueryResponse setTemplateList(List<TemplateInfo> templateList) {
		this.templateList = templateList;
		return this;
	}
	
	/**
	 * Inner class representing a freight template.
	 */
	public static class TemplateInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Template name.
		 */
		private String templateName;
		
		/**
		 * Template ID.
		 */
		private String templateId;
			
		public TemplateInfo() {
		}
		
		/**
		 * @return the template name
		 */
		public String getTemplateName() {
			return templateName;
		}
		
		/**
		 * @param templateName the template name
		 * @return this object for method chaining
		 */
		public TemplateInfo setTemplateName(String templateName) {
			this.templateName = templateName;
			return this;
		}
		
		/**
		 * @return the template ID
		 */
		public String getTemplateId() {
			return templateId;
		}
		
		/**
		 * @param templateId the template ID
		 * @return this object for method chaining
		 */
		public TemplateInfo setTemplateId(String templateId) {
			this.templateId = templateId;
			return this;
		}
	}
}