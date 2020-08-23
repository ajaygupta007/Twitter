/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Follower extends org.jooq.impl.TableImpl<tech.codingclub.helix.tables.records.FollowerRecord> {

	private static final long serialVersionUID = 1205219552;

	/**
	 * The singleton instance of <code>public.follower</code>
	 */
	public static final tech.codingclub.helix.tables.Follower FOLLOWER = new tech.codingclub.helix.tables.Follower();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<tech.codingclub.helix.tables.records.FollowerRecord> getRecordType() {
		return tech.codingclub.helix.tables.records.FollowerRecord.class;
	}

	/**
	 * The column <code>public.follower.user_id</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.FollowerRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.follower.following_id</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.FollowerRecord, java.lang.Long> FOLLOWING_ID = createField("following_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.follower</code> table reference
	 */
	public Follower() {
		this("follower", null);
	}

	/**
	 * Create an aliased <code>public.follower</code> table reference
	 */
	public Follower(java.lang.String alias) {
		this(alias, tech.codingclub.helix.tables.Follower.FOLLOWER);
	}

	private Follower(java.lang.String alias, org.jooq.Table<tech.codingclub.helix.tables.records.FollowerRecord> aliased) {
		this(alias, aliased, null);
	}

	private Follower(java.lang.String alias, org.jooq.Table<tech.codingclub.helix.tables.records.FollowerRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, tech.codingclub.helix.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<tech.codingclub.helix.tables.records.FollowerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<tech.codingclub.helix.tables.records.FollowerRecord>>asList(tech.codingclub.helix.Keys.FOLLOWER_USER_ID_FOLLOWING_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, ?>>asList(tech.codingclub.helix.Keys.FOLLOWER__USER_ID, tech.codingclub.helix.Keys.FOLLOWER__FOLLOWER_FOLLOWING_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public tech.codingclub.helix.tables.Follower as(java.lang.String alias) {
		return new tech.codingclub.helix.tables.Follower(alias, this);
	}

	/**
	 * Rename this table
	 */
	public tech.codingclub.helix.tables.Follower rename(java.lang.String name) {
		return new tech.codingclub.helix.tables.Follower(name, null);
	}
}
