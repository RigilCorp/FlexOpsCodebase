package com.flexops.proc.core.entity;




public class TestEntity {
	
	private final long id;
    private final String content;
    
	public TestEntity(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
    
    
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
	
}
