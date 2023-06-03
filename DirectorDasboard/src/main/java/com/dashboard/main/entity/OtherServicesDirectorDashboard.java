package com.dashboard.main.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name="OtherServices_DirectorDashboard")
public class OtherServicesDirectorDashboard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String DistrictName;
	private String UlbName;
	private String Year;
	private String Month;
	private String TotalWard;
	private String TotalArea;
	private String UlbPopulation;
	private String CreateDate;
	private String extra;
	
	//SBM-U
	private String D2dWasteCollection;
	private String D2dWasteSegregation;
	private String CtPt;
	private String PublicUrinal;
	private String Ihhl;
	private String OdfStatus;
	private String GfcStarRating;
	private String PlasticCompactor;
	private String MrfCentres;
	private String SupBan;
	private String SupChallan;
	private String GisMap;
	private String AlAsChallan;
	private String AlAsFineCollected;
	private String BinFreeCityNotified;
	private String PlasticChallan;
	private String BwgIdentified;
	private String BwgOnlineComposting;
	private String SwmFundReleased;
	private String SwmFundUtilised;
	
	//DAY-NULM
	private String SepI;
	private String ShgBl;
	private String ShgFormation;
	private String ShgRevolvingFund;
	private String AlfFormation;
	private String AlfRevolvingFund;
	private String PmfmeShg;
	private String PmsvaNidhi;
	
	//PMAY-HFA
	private String SelfBlcAccCount;
	private String ProgressBlcAccCount;
	private String CompleteBlcAccCount;
	
	//AMRUT
	private String GisMasterPlan2041;
	private String WaterSupply;
	private String Sewerage;
	private String Drainage;
	private String Parks;
	
}
