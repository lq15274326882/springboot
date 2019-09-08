package com.itstyle.doc.model;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.itstyle.doc.common.utils.DateUtil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data                
@NoArgsConstructor     
@AllArgsConstructor
@Entity
@Table(name = "md_attachment" )
public class Attachment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "attachment_id", nullable = false)
	private Integer attachmentId;
	@Column(nullable = false)
    private Integer bookId;
	@Column(nullable = false)
    private Integer documentId;
	@Column(nullable = false)
    private String fileName;
	@Column(nullable = true)
    private String filePath;
	
	@Column(nullable = false)
    private Double fileSize;
	@Column(nullable = false)
    private String httpPath;
	@Column(nullable = false)
    private String fileExt;
	
	@Column(nullable = false)
    private Timestamp createTime=DateUtil.getTimestamp();
	@Column(nullable = false)
    private Integer createAt=0;
}
