/**
 * This class is generated by jOOQ
 */
package at.hammer.jooq_generated;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>chinook</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.AlbumRecord, java.lang.Integer> IDENTITY_ALBUM = Identities0.IDENTITY_ALBUM;
	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.ArtistRecord, java.lang.Integer> IDENTITY_ARTIST = Identities0.IDENTITY_ARTIST;
	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.Integer> IDENTITY_CUSTOMER = Identities0.IDENTITY_CUSTOMER;
	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.EmployeeRecord, java.lang.Integer> IDENTITY_EMPLOYEE = Identities0.IDENTITY_EMPLOYEE;
	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.GenreRecord, java.lang.Integer> IDENTITY_GENRE = Identities0.IDENTITY_GENRE;
	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.InvoiceRecord, java.lang.Integer> IDENTITY_INVOICE = Identities0.IDENTITY_INVOICE;
	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.InvoicelineRecord, java.lang.Integer> IDENTITY_INVOICELINE = Identities0.IDENTITY_INVOICELINE;
	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.MediatypeRecord, java.lang.Integer> IDENTITY_MEDIATYPE = Identities0.IDENTITY_MEDIATYPE;
	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.PlaylistRecord, java.lang.Integer> IDENTITY_PLAYLIST = Identities0.IDENTITY_PLAYLIST;
	public static final org.jooq.Identity<at.hammer.jooq_generated.tables.records.TrackRecord, java.lang.Integer> IDENTITY_TRACK = Identities0.IDENTITY_TRACK;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.AlbumRecord> KEY_ALBUM_PRIMARY = UniqueKeys0.KEY_ALBUM_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.ArtistRecord> KEY_ARTIST_PRIMARY = UniqueKeys0.KEY_ARTIST_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.CustomerRecord> KEY_CUSTOMER_PRIMARY = UniqueKeys0.KEY_CUSTOMER_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.EmployeeRecord> KEY_EMPLOYEE_PRIMARY = UniqueKeys0.KEY_EMPLOYEE_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.GenreRecord> KEY_GENRE_PRIMARY = UniqueKeys0.KEY_GENRE_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.InvoiceRecord> KEY_INVOICE_PRIMARY = UniqueKeys0.KEY_INVOICE_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord> KEY_INVOICELINE_PRIMARY = UniqueKeys0.KEY_INVOICELINE_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.MediatypeRecord> KEY_MEDIATYPE_PRIMARY = UniqueKeys0.KEY_MEDIATYPE_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.PlaylistRecord> KEY_PLAYLIST_PRIMARY = UniqueKeys0.KEY_PLAYLIST_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.PlaylisttrackRecord> KEY_PLAYLISTTRACK_PRIMARY = UniqueKeys0.KEY_PLAYLISTTRACK_PRIMARY;
	public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.TrackRecord> KEY_TRACK_PRIMARY = UniqueKeys0.KEY_TRACK_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.AlbumRecord, at.hammer.jooq_generated.tables.records.ArtistRecord> FK_ALBUMARTISTID = ForeignKeys0.FK_ALBUMARTISTID;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.CustomerRecord, at.hammer.jooq_generated.tables.records.EmployeeRecord> FK_CUSTOMERSUPPORTREPID = ForeignKeys0.FK_CUSTOMERSUPPORTREPID;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.EmployeeRecord, at.hammer.jooq_generated.tables.records.EmployeeRecord> FK_EMPLOYEEREPORTSTO = ForeignKeys0.FK_EMPLOYEEREPORTSTO;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.InvoiceRecord, at.hammer.jooq_generated.tables.records.CustomerRecord> FK_INVOICECUSTOMERID = ForeignKeys0.FK_INVOICECUSTOMERID;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord, at.hammer.jooq_generated.tables.records.InvoiceRecord> FK_INVOICELINEINVOICEID = ForeignKeys0.FK_INVOICELINEINVOICEID;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord, at.hammer.jooq_generated.tables.records.TrackRecord> FK_INVOICELINETRACKID = ForeignKeys0.FK_INVOICELINETRACKID;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.PlaylisttrackRecord, at.hammer.jooq_generated.tables.records.PlaylistRecord> FK_PLAYLISTTRACKPLAYLISTID = ForeignKeys0.FK_PLAYLISTTRACKPLAYLISTID;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.PlaylisttrackRecord, at.hammer.jooq_generated.tables.records.TrackRecord> FK_PLAYLISTTRACKTRACKID = ForeignKeys0.FK_PLAYLISTTRACKTRACKID;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.TrackRecord, at.hammer.jooq_generated.tables.records.AlbumRecord> FK_TRACKALBUMID = ForeignKeys0.FK_TRACKALBUMID;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.TrackRecord, at.hammer.jooq_generated.tables.records.MediatypeRecord> FK_TRACKMEDIATYPEID = ForeignKeys0.FK_TRACKMEDIATYPEID;
	public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.TrackRecord, at.hammer.jooq_generated.tables.records.GenreRecord> FK_TRACKGENREID = ForeignKeys0.FK_TRACKGENREID;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.AlbumRecord, java.lang.Integer> IDENTITY_ALBUM = createIdentity(at.hammer.jooq_generated.tables.Album.ALBUM, at.hammer.jooq_generated.tables.Album.ALBUM.ALBUMID);
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.ArtistRecord, java.lang.Integer> IDENTITY_ARTIST = createIdentity(at.hammer.jooq_generated.tables.Artist.ARTIST, at.hammer.jooq_generated.tables.Artist.ARTIST.ARTISTID);
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.Integer> IDENTITY_CUSTOMER = createIdentity(at.hammer.jooq_generated.tables.Customer.CUSTOMER, at.hammer.jooq_generated.tables.Customer.CUSTOMER.CUSTOMERID);
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.EmployeeRecord, java.lang.Integer> IDENTITY_EMPLOYEE = createIdentity(at.hammer.jooq_generated.tables.Employee.EMPLOYEE, at.hammer.jooq_generated.tables.Employee.EMPLOYEE.EMPLOYEEID);
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.GenreRecord, java.lang.Integer> IDENTITY_GENRE = createIdentity(at.hammer.jooq_generated.tables.Genre.GENRE, at.hammer.jooq_generated.tables.Genre.GENRE.GENREID);
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.InvoiceRecord, java.lang.Integer> IDENTITY_INVOICE = createIdentity(at.hammer.jooq_generated.tables.Invoice.INVOICE, at.hammer.jooq_generated.tables.Invoice.INVOICE.INVOICEID);
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.InvoicelineRecord, java.lang.Integer> IDENTITY_INVOICELINE = createIdentity(at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE, at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE.INVOICELINEID);
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.MediatypeRecord, java.lang.Integer> IDENTITY_MEDIATYPE = createIdentity(at.hammer.jooq_generated.tables.Mediatype.MEDIATYPE, at.hammer.jooq_generated.tables.Mediatype.MEDIATYPE.MEDIATYPEID);
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.PlaylistRecord, java.lang.Integer> IDENTITY_PLAYLIST = createIdentity(at.hammer.jooq_generated.tables.Playlist.PLAYLIST, at.hammer.jooq_generated.tables.Playlist.PLAYLIST.PLAYLISTID);
		public static org.jooq.Identity<at.hammer.jooq_generated.tables.records.TrackRecord, java.lang.Integer> IDENTITY_TRACK = createIdentity(at.hammer.jooq_generated.tables.Track.TRACK, at.hammer.jooq_generated.tables.Track.TRACK.TRACKID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.AlbumRecord> KEY_ALBUM_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Album.ALBUM, at.hammer.jooq_generated.tables.Album.ALBUM.ALBUMID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.ArtistRecord> KEY_ARTIST_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Artist.ARTIST, at.hammer.jooq_generated.tables.Artist.ARTIST.ARTISTID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.CustomerRecord> KEY_CUSTOMER_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Customer.CUSTOMER, at.hammer.jooq_generated.tables.Customer.CUSTOMER.CUSTOMERID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.EmployeeRecord> KEY_EMPLOYEE_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Employee.EMPLOYEE, at.hammer.jooq_generated.tables.Employee.EMPLOYEE.EMPLOYEEID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.GenreRecord> KEY_GENRE_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Genre.GENRE, at.hammer.jooq_generated.tables.Genre.GENRE.GENREID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.InvoiceRecord> KEY_INVOICE_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Invoice.INVOICE, at.hammer.jooq_generated.tables.Invoice.INVOICE.INVOICEID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord> KEY_INVOICELINE_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE, at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE.INVOICELINEID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.MediatypeRecord> KEY_MEDIATYPE_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Mediatype.MEDIATYPE, at.hammer.jooq_generated.tables.Mediatype.MEDIATYPE.MEDIATYPEID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.PlaylistRecord> KEY_PLAYLIST_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Playlist.PLAYLIST, at.hammer.jooq_generated.tables.Playlist.PLAYLIST.PLAYLISTID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.PlaylisttrackRecord> KEY_PLAYLISTTRACK_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK, at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK.PLAYLISTID, at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK.TRACKID);
		public static final org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.TrackRecord> KEY_TRACK_PRIMARY = createUniqueKey(at.hammer.jooq_generated.tables.Track.TRACK, at.hammer.jooq_generated.tables.Track.TRACK.TRACKID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.AlbumRecord, at.hammer.jooq_generated.tables.records.ArtistRecord> FK_ALBUMARTISTID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_ARTIST_PRIMARY, at.hammer.jooq_generated.tables.Album.ALBUM, at.hammer.jooq_generated.tables.Album.ALBUM.ARTISTID);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.CustomerRecord, at.hammer.jooq_generated.tables.records.EmployeeRecord> FK_CUSTOMERSUPPORTREPID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_EMPLOYEE_PRIMARY, at.hammer.jooq_generated.tables.Customer.CUSTOMER, at.hammer.jooq_generated.tables.Customer.CUSTOMER.SUPPORTREPID);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.EmployeeRecord, at.hammer.jooq_generated.tables.records.EmployeeRecord> FK_EMPLOYEEREPORTSTO = createForeignKey(at.hammer.jooq_generated.Keys.KEY_EMPLOYEE_PRIMARY, at.hammer.jooq_generated.tables.Employee.EMPLOYEE, at.hammer.jooq_generated.tables.Employee.EMPLOYEE.REPORTSTO);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.InvoiceRecord, at.hammer.jooq_generated.tables.records.CustomerRecord> FK_INVOICECUSTOMERID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_CUSTOMER_PRIMARY, at.hammer.jooq_generated.tables.Invoice.INVOICE, at.hammer.jooq_generated.tables.Invoice.INVOICE.CUSTOMERID);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord, at.hammer.jooq_generated.tables.records.InvoiceRecord> FK_INVOICELINEINVOICEID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_INVOICE_PRIMARY, at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE, at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE.INVOICEID);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord, at.hammer.jooq_generated.tables.records.TrackRecord> FK_INVOICELINETRACKID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_TRACK_PRIMARY, at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE, at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE.TRACKID);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.PlaylisttrackRecord, at.hammer.jooq_generated.tables.records.PlaylistRecord> FK_PLAYLISTTRACKPLAYLISTID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_PLAYLIST_PRIMARY, at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK, at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK.PLAYLISTID);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.PlaylisttrackRecord, at.hammer.jooq_generated.tables.records.TrackRecord> FK_PLAYLISTTRACKTRACKID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_TRACK_PRIMARY, at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK, at.hammer.jooq_generated.tables.Playlisttrack.PLAYLISTTRACK.TRACKID);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.TrackRecord, at.hammer.jooq_generated.tables.records.AlbumRecord> FK_TRACKALBUMID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_ALBUM_PRIMARY, at.hammer.jooq_generated.tables.Track.TRACK, at.hammer.jooq_generated.tables.Track.TRACK.ALBUMID);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.TrackRecord, at.hammer.jooq_generated.tables.records.MediatypeRecord> FK_TRACKMEDIATYPEID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_MEDIATYPE_PRIMARY, at.hammer.jooq_generated.tables.Track.TRACK, at.hammer.jooq_generated.tables.Track.TRACK.MEDIATYPEID);
		public static final org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.TrackRecord, at.hammer.jooq_generated.tables.records.GenreRecord> FK_TRACKGENREID = createForeignKey(at.hammer.jooq_generated.Keys.KEY_GENRE_PRIMARY, at.hammer.jooq_generated.tables.Track.TRACK, at.hammer.jooq_generated.tables.Track.TRACK.GENREID);
	}
}
