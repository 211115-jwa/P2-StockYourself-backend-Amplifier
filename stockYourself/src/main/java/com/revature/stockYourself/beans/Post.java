package com.revature.stockYourself.beans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Post {
	private int postId;
	private String postContent;
	private LocalDate creationDate;
	private LocalTime creationTime;
	private User creator;
	
	public Post() {
		postId = 0;
		postContent = " ";
		creationDate = LocalDate.now();
		creationTime = LocalTime.now();
		creator = null;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalTime getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(LocalTime creationTime) {
		this.creationTime = creationTime;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postContent=" + postContent + ", creationDate=" + creationDate
				+ ", creationTime=" + creationTime + ", creator=" + creator + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationDate, creationTime, creator, postContent, postId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(creationDate, other.creationDate) && Objects.equals(creationTime, other.creationTime)
				&& Objects.equals(creator, other.creator) && Objects.equals(postContent, other.postContent)
				&& postId == other.postId;
	}
	
	
}