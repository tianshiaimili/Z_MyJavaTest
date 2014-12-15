package date;

public class ExportItemCfgVO {
	private Integer seq;
	private String colLabel;
	private String fieldName;
	private String dataType;

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getColLabel() {
		return this.colLabel;
	}

	public void setColLabel(String colLabel) {
		this.colLabel = colLabel;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.seq == null) ? 0 : this.seq.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		if (!(obj instanceof ExportItemCfgVO)) {
			return false;
		}
		ExportItemCfgVO other = (ExportItemCfgVO) obj;
		if (this.seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!this.seq.equals(other.seq)) {
			return false;
		}
		return true;
	}
}
