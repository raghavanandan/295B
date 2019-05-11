package com.mark.pojo;

import java.util.List;

public class SaveModel{
	
	
	private String model;
	private List<String> featureCol;
	private List<String> colType;
	private String label;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<String> getFeatureCol() {
		return featureCol;
	}
	public void setFeatureCol(List<String> featureCol) {
		this.featureCol = featureCol;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<String> getColType() {
		return colType;
	}
	public void setColType(List<String> colType) {
		this.colType = colType;
	}
	
	@Override
	public String toString() {
		return "SaveModel [model=" + model + ", featureCol=" + featureCol + ", colType=" + colType + ", label=" + label
				+ "]";
	}
	
	
}