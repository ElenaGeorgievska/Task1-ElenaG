package com.example.task.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String reviewId;
	private String reviewFullText;
	private String reviewText;

	private Integer numLikes;
	private Integer numComments;
	private Integer numShares;
	private Integer rating;

	private String reviewCreatedOn;
	private String reviewCreatedOnDate;
	private Integer reviewCreatedOnTime;

	private String reviewerId;
	private String reviwerUrl;
	private String reviewerName;
	private String reviewerEmail;

	private String sourceType;
	private Boolean isVerified;
	private String source;
	private String sourceName;
	private String sourceId;

	// private Class <byte[]> tags;
	private String href;
	private String logoHref;
	// private Class <byte[]> photos;

	/*@Override
	public String toString() {
		return "Reviews [id=" + id + ", reviewId=" + reviewId + ", reviewFullText=" + reviewFullText + ", reviewText="
				+ reviewText + ", numLikes = " + numLikes + ", numComments=" + numComments + ", numShares=" + numShares
				+ ", rating=" + rating + ", reviewCreatedOn=" + reviewCreatedOn + ", reviewCreatedOnDate="
				+ reviewCreatedOnDate + ", reviewCreatedOnTime=" + reviewCreatedOnTime + ", reviewerId=" + reviewerId
				+ ", reviwerUrl=" + reviwerUrl + ", reviewerName=" + reviewerName + ", reviewerEmail=" + reviewerEmail
				+ ", sourceType=" + sourceType + ", isVerified=" + isVerified + ", source=" + source + ", sourceName="
				+ sourceName + ", sourceId=" + sourceId + ", href=" + href + ", logoHref=" + logoHref + "]";
	}*/

}
