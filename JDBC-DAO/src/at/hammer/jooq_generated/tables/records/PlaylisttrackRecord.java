/**
 * This class is generated by jOOQ
 */
package at.hammer.jooq_generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlaylisttrackRecord extends org.jooq.impl.UpdatableRecordImpl<at.hammer.jooq_generated.tables.records.PlaylisttrackRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 704005499;

	/**
	 * Setter for <code>chinook.playlisttrack.PlaylistId</code>. 
	 */
	public void setPlaylistid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>chinook.playlisttrack.PlaylistId</code>. 
	 */
	public java.lang.Integer getPlaylistid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>chinook.playlisttrack.TrackId</code>. 
	 */
	public void setTrackid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>chinook.playlisttrack.TrackId</code>. 
	 */
	public java.lang.Integer getTrackid() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK.PLAYLISTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK.TRACKID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getPlaylistid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getTrackid();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PlaylisttrackRecord
	 */
	public PlaylisttrackRecord() {
		super(at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK);
	}

	/**
	 * Create a detached, initialised PlaylisttrackRecord
	 */
	public PlaylisttrackRecord(java.lang.Integer playlistid, java.lang.Integer trackid) {
		super(at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK);

		setValue(0, playlistid);
		setValue(1, trackid);
	}
}
