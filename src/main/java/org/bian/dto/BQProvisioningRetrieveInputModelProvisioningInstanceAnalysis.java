package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProvisioningRetrieveInputModelProvisioningInstanceAnalysis
 */
public class BQProvisioningRetrieveInputModelProvisioningInstanceAnalysis   {
  private String provisioningInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return provisioningInstanceAnalysisReference
  **/

  public String getProvisioningInstanceAnalysisReference() {
    return provisioningInstanceAnalysisReference;
  }

  public void setProvisioningInstanceAnalysisReference(String provisioningInstanceAnalysisReference) {
    this.provisioningInstanceAnalysisReference = provisioningInstanceAnalysisReference;
  }


}

