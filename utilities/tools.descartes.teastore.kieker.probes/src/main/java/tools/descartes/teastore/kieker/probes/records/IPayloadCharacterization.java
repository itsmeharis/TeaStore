package tools.descartes.teastore.kieker.probes.records;

import kieker.common.record.IMonitoringRecord;

/**
 * Interface in order to realize parameter logging with Kieker.
 * 
 * @author Johannes Grohmann, Reiner Jung
 * 
 * 
 * 
 * @since 1.0
 */
public interface IPayloadCharacterization extends IMonitoringRecord {
	public String[] getParameters();

	public String[] getValues();

	public String getReturnType();

	public String getReturnValue();

	public int getRequestType();

}