package model;


	import java.io.Serializable;
	import javax.persistence.*;

	//https://jar-download.com/download-handling.php
	/**
	 * The persistent class for the S_STUDENT database table.
	 * 
	 */
	@Entity
	@Table(name="S_STUDENT")
	@NamedQuery(name="SStudent.findAll", query="SELECT s FROM SStudent s")
	public class SStudent implements Serializable  {
		private static final long serialVersionUID = 1L;

		@Id
		private long sid;

		private String cname;

		private String sadd;

		private String sname;

		private java.math.BigDecimal tid;

		public SStudent() {
		}

		public long getSid() {
			return this.sid;
		}

		public void setSid(long sid) {
			this.sid = sid;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getSadd() {
			return this.sadd;
		}

		public void setSadd(String sadd) {
			this.sadd = sadd;
		}

		public String getSname() {
			return this.sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public java.math.BigDecimal getTid() {
			return this.tid;
		}

		public void setTid(java.math.BigDecimal tid) {
			this.tid = tid;
		}

	}

