package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryDistributionAdministrativePlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanRequestInputModel
 */
public class CRProductInventoryDistributionAdministrativePlanRequestInputModel   {
  private String productInventoryDistributionServicingSessionReference = null;

  private String productInventoryDistributionAdministrativePlanInstanceReference = null;

  private String productInventoryDistributionAdministrativePlanBudgetType = null;

  private String productInventoryDistributionAdministrativePlanAssignment = null;

  private String productInventoryDistributionAdministrativePlanPlan = null;

  private String productInventoryDistributionAdministrativePlanReference = null;

  private Object productInventoryDistributionAdministrativePlanRequestActionTaskRecord = null;

  private CRProductInventoryDistributionAdministrativePlanRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productInventoryDistributionServicingSessionReference
  **/

  public String getProductInventoryDistributionServicingSessionReference() {
    return productInventoryDistributionServicingSessionReference;
  }

  public void setProductInventoryDistributionServicingSessionReference(String productInventoryDistributionServicingSessionReference) {
    this.productInventoryDistributionServicingSessionReference = productInventoryDistributionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Inventory Distribution AdministrativePlan instance 
   * @return productInventoryDistributionAdministrativePlanInstanceReference
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceReference() {
    return productInventoryDistributionAdministrativePlanInstanceReference;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReference(String productInventoryDistributionAdministrativePlanInstanceReference) {
    this.productInventoryDistributionAdministrativePlanInstanceReference = productInventoryDistributionAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Budgets within Product Inventory Distribution AdministrativePlan according to the type of resource and/or activity that is budgetted 
   * @return productInventoryDistributionAdministrativePlanBudgetType
  **/

  public String getProductInventoryDistributionAdministrativePlanBudgetType() {
    return productInventoryDistributionAdministrativePlanBudgetType;
  }

  public void setProductInventoryDistributionAdministrativePlanBudgetType(String productInventoryDistributionAdministrativePlanBudgetType) {
    this.productInventoryDistributionAdministrativePlanBudgetType = productInventoryDistributionAdministrativePlanBudgetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allocation of someone or something which is specified for Product Inventory Distribution AdministrativePlan 
   * @return productInventoryDistributionAdministrativePlanAssignment
  **/

  public String getProductInventoryDistributionAdministrativePlanAssignment() {
    return productInventoryDistributionAdministrativePlanAssignment;
  }

  public void setProductInventoryDistributionAdministrativePlanAssignment(String productInventoryDistributionAdministrativePlanAssignment) {
    this.productInventoryDistributionAdministrativePlanAssignment = productInventoryDistributionAdministrativePlanAssignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A plan that defines clerical support for ProductInventoryDistribution 
   * @return productInventoryDistributionAdministrativePlanPlan
  **/

  public String getProductInventoryDistributionAdministrativePlanPlan() {
    return productInventoryDistributionAdministrativePlanPlan;
  }

  public void setProductInventoryDistributionAdministrativePlanPlan(String productInventoryDistributionAdministrativePlanPlan) {
    this.productInventoryDistributionAdministrativePlanPlan = productInventoryDistributionAdministrativePlanPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Party who is involved in Product Inventory Distribution AdministrativePlan 
   * @return productInventoryDistributionAdministrativePlanReference
  **/

  public String getProductInventoryDistributionAdministrativePlanReference() {
    return productInventoryDistributionAdministrativePlanReference;
  }

  public void setProductInventoryDistributionAdministrativePlanReference(String productInventoryDistributionAdministrativePlanReference) {
    this.productInventoryDistributionAdministrativePlanReference = productInventoryDistributionAdministrativePlanReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productInventoryDistributionAdministrativePlanRequestActionTaskRecord
  **/

  public Object getProductInventoryDistributionAdministrativePlanRequestActionTaskRecord() {
    return productInventoryDistributionAdministrativePlanRequestActionTaskRecord;
  }

  public void setProductInventoryDistributionAdministrativePlanRequestActionTaskRecord(Object productInventoryDistributionAdministrativePlanRequestActionTaskRecord) {
    this.productInventoryDistributionAdministrativePlanRequestActionTaskRecord = productInventoryDistributionAdministrativePlanRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductInventoryDistributionAdministrativePlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductInventoryDistributionAdministrativePlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

