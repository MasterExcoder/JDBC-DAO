/**
 * This class is generated by jOOQ
 */
package at.hammer.jooq_generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Artist extends org.jooq.impl.TableImpl<at.hammer.jooq_generated.tables.records.ArtistRecord> {

	private static final long serialVersionUID = -1245010765;

	/**
	 * The singleton instance of <code>chinook.artist</code>
	 */
	public static final at.hammer.jooq_generated.tables.Artist ARTIST = new at.hammer.jooq_generated.tables.Artist();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<at.hammer.jooq_generated.tables.records.ArtistRecord> getRecordType() {
		return at.hammer.jooq_generated.tables.records.ArtistRecord.class;
	}

	/**
	 * The column <code>chinook.artist.ArtistId</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.ArtistRecord, java.lang.Integer> ARTISTID = createField("ArtistId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>chinook.artist.Name</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.ArtistRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR.length(120), this);

	/**
	 * Create a <code>chinook.artist</code> table reference
	 */
	public Artist() {
		super("artist", at.hammer.jooq_generated.Chinook.CHINOOK);
	}

	/**
	 * Create an aliased <code>chinook.artist</code> table reference
	 */
	public Artist(java.lang.String alias) {
		super(alias, at.hammer.jooq_generated.Chinook.CHINOOK, at.hammer.jooq_generated.tables.Artist.ARTIST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<at.hammer.jooq_generated.tables.records.ArtistRecord, java.lang.Integer> getIdentity() {
		return at.hammer.jooq_generated.Keys.IDENTITY_ARTIST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.ArtistRecord> getPrimaryKey() {
		return at.hammer.jooq_generated.Keys.KEY_ARTIST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.ArtistRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.ArtistRecord>>asList(at.hammer.jooq_generated.Keys.KEY_ARTIST_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public at.hammer.jooq_generated.tables.Artist as(java.lang.String alias) {
		return new at.hammer.jooq_generated.tables.Artist(alias);
	}
}
