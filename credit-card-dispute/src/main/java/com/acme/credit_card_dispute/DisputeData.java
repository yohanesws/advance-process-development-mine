package com.acme.credit_card_dispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class DisputeData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "DISPUTEDATA_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "DISPUTEDATA_ID_SEQ", name = "DISPUTEDATA_ID_GENERATOR")
	private java.lang.Long id;

	private java.math.BigDecimal amount;

	private boolean approved;

	private boolean automated;

	private java.lang.String cardID;

	private int cardholderAge;

	private java.lang.Integer cardholderRiskRating;

	private java.lang.String cardholderStatus;

	private java.lang.Integer disputeRiskRating;

	private java.lang.Integer incidentCount;

	private java.lang.String caseID;

	public DisputeData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.math.BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(java.math.BigDecimal amount) {
		this.amount = amount;
	}

	public boolean isApproved() {
		return this.approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public boolean isAutomated() {
		return this.automated;
	}

	public void setAutomated(boolean automated) {
		this.automated = automated;
	}

	public java.lang.String getCardID() {
		return this.cardID;
	}

	public void setCardID(java.lang.String cardID) {
		this.cardID = cardID;
	}

	public int getCardholderAge() {
		return this.cardholderAge;
	}

	public void setCardholderAge(int cardholderAge) {
		this.cardholderAge = cardholderAge;
	}

	public java.lang.Integer getCardholderRiskRating() {
		return this.cardholderRiskRating;
	}

	public void setCardholderRiskRating(java.lang.Integer cardholderRiskRating) {
		this.cardholderRiskRating = cardholderRiskRating;
	}

	public java.lang.String getCardholderStatus() {
		return this.cardholderStatus;
	}

	public void setCardholderStatus(java.lang.String cardholderStatus) {
		this.cardholderStatus = cardholderStatus;
	}

	public java.lang.Integer getDisputeRiskRating() {
		return this.disputeRiskRating;
	}

	public void setDisputeRiskRating(java.lang.Integer disputeRiskRating) {
		this.disputeRiskRating = disputeRiskRating;
	}

	public java.lang.Integer getIncidentCount() {
		return this.incidentCount;
	}

	public void setIncidentCount(java.lang.Integer incidentCount) {
		this.incidentCount = incidentCount;
	}

	public java.lang.String getCaseID() {
		return this.caseID;
	}

	public void setCaseID(java.lang.String caseID) {
		this.caseID = caseID;
	}

	public DisputeData(java.lang.Long id, java.math.BigDecimal amount,
			boolean approved, boolean automated, java.lang.String cardID,
			int cardholderAge, java.lang.Integer cardholderRiskRating,
			java.lang.String cardholderStatus,
			java.lang.Integer disputeRiskRating,
			java.lang.Integer incidentCount, java.lang.String caseID) {
		this.id = id;
		this.amount = amount;
		this.approved = approved;
		this.automated = automated;
		this.cardID = cardID;
		this.cardholderAge = cardholderAge;
		this.cardholderRiskRating = cardholderRiskRating;
		this.cardholderStatus = cardholderStatus;
		this.disputeRiskRating = disputeRiskRating;
		this.incidentCount = incidentCount;
		this.caseID = caseID;
	}

}