/**
 * 
 */
package com.mm.jp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dorak
 *
 */
@Entity
@Table(name = "job_applications")
public class JobApplication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ja_id")
	private Long jaId;
	
	@Column(name = "ja_js_id")
	private Long jaJsId;
	
	@Column(name = "ja_jp_id")
	private Long jaJpId;

	/**
	 * @param jaJsId
	 * @param jaJpId
	 */
	public JobApplication(Long jaJsId, Long jaJpId) {
		this.jaJsId = jaJsId;
		this.jaJpId = jaJpId;
	}
	
	public JobApplication() {}

	/**
	 * @return the jaId
	 */
	public Long getJaId() {
		return jaId;
	}

	/**
	 * @param jaId the jaId to set
	 */
	public void setJaId(Long jaId) {
		this.jaId = jaId;
	}

	/**
	 * @return the jaJsId
	 */
	public Long getJaJsId() {
		return jaJsId;
	}

	/**
	 * @param jaJsId the jaJsId to set
	 */
	public void setJaJsId(Long jaJsId) {
		this.jaJsId = jaJsId;
	}

	/**
	 * @return the jaJpId
	 */
	public Long getJaJpId() {
		return jaJpId;
	}

	/**
	 * @param jaJpId the jaJpId to set
	 */
	public void setJaJpId(Long jaJpId) {
		this.jaJpId = jaJpId;
	}

}
