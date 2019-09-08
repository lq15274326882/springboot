package com.itstyle.doc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data                
@NoArgsConstructor     
@AllArgsConstructor
@Entity
@Table(name = "md_options" )
public class Options {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "option_id", nullable = false)
	private Integer optionId;
	@Column(nullable = false)
    private String optionTitle;
	@Column(nullable = false)
    private String optionName;
	@Column(nullable = false)
    private String optionValue;
	@Column(nullable = false)
    private String remark;
}
