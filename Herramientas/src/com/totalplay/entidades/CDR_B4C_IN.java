package com.totalplay.entidades;

public class CDR_B4C_IN {

	private String dial;
	private String called;
	private String caller;
	private String start_time;
	private String end_time;
	private int caller_id;
	private int called_id;
	private int duracion;
	private int charge_party_indicator;
	private int trunk_group_in;
	private int trunk_group_out;
	private String incoming_trunk;
	private String outgoing_trunk;
	private int termination_code;
	private long csn;
	private int gsvn;
	private int partial_record_indicator;
	private int partial_counter;
	private long first_service_access;
	
	public String getDial() {
		return dial;
	}
	public void setDial(String dial) {
		this.dial = dial;
	}
	public String getCalled() {
		return called;
	}
	public void setCalled(String called) {
		this.called = called;
	}
	public String getCaller() {
		return caller;
	}
	public void setCaller(String caller) {
		this.caller = caller;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public int getCaller_id() {
		return caller_id;
	}
	public void setCaller_id(int caller_id) {
		this.caller_id = caller_id;
	}
	public int getCalled_id() {
		return called_id;
	}
	public void setCalled_id(int called_id) {
		this.called_id = called_id;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getCharge_party_indicator() {
		return charge_party_indicator;
	}
	public void setCharge_party_indicator(int charge_party_indicator) {
		this.charge_party_indicator = charge_party_indicator;
	}
	public int getTrunk_group_in() {
		return trunk_group_in;
	}
	public void setTrunk_group_in(int trunk_group_in) {
		this.trunk_group_in = trunk_group_in;
	}
	public int getTrunk_group_out() {
		return trunk_group_out;
	}
	public void setTrunk_group_out(int trunk_group_out) {
		this.trunk_group_out = trunk_group_out;
	}
	public String getIncoming_trunk() {
		return incoming_trunk;
	}
	public void setIncoming_trunk(String incoming_trunk) {
		this.incoming_trunk = incoming_trunk;
	}
	public String getOutgoing_trunk() {
		return outgoing_trunk;
	}
	public void setOutgoing_trunk(String outgoing_trunk) {
		this.outgoing_trunk = outgoing_trunk;
	}
	public int getTermination_code() {
		return termination_code;
	}
	public void setTermination_code(int termination_code) {
		this.termination_code = termination_code;
	}
	public long getCsn() {
		return csn;
	}
	public void setCsn(long csn) {
		this.csn = csn;
	}
	public int getGsvn() {
		return gsvn;
	}
	public void setGsvn(int gsvn) {
		this.gsvn = gsvn;
	}
	public int getPartial_record_indicator() {
		return partial_record_indicator;
	}
	public void setPartial_record_indicator(int partial_record_indicator) {
		this.partial_record_indicator = partial_record_indicator;
	}
	public int getPartial_counter() {
		return partial_counter;
	}
	public void setPartial_counter(int partial_counter) {
		this.partial_counter = partial_counter;
	}
	public long getFirst_service_access() {
		return first_service_access;
	}
	public void setFirst_service_access(long first_service_access) {
		this.first_service_access = first_service_access;
	}
}
