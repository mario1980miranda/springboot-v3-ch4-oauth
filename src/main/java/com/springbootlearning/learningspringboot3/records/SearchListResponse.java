package com.springbootlearning.learningspringboot3.records;

// @formatter:off
public record SearchListResponse(
		String kind, 
		String etag,
		String nextPageToken,
		String prevPageToken,
		PageInfo pageInfo,
		SearchResult[] items) {
}
// @formatter:on