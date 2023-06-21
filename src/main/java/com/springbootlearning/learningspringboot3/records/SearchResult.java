package com.springbootlearning.learningspringboot3.records;

// @formatter:off
public record SearchResult(
		String kind, 
		String etag, 
		SearchId id,
		SearchSnippet snippet) {
	
}
// @formatter:on

