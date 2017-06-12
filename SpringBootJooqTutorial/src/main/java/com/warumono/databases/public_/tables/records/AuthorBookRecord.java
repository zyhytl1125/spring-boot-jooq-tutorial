/*
 * This file is generated by jOOQ.
*/
package com.warumono.databases.public_.tables.records;


import com.warumono.databases.public_.tables.AuthorBook;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorBookRecord extends UpdatableRecordImpl<AuthorBookRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 317021077;

    /**
     * Setter for <code>PUBLIC.AUTHOR_BOOK.AUTHOR_ID</code>.
     */
    public void setAuthorId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.AUTHOR_BOOK.AUTHOR_ID</code>.
     */
    public Long getAuthorId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.AUTHOR_BOOK.BOOK_ID</code>.
     */
    public void setBookId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.AUTHOR_BOOK.BOOK_ID</code>.
     */
    public Long getBookId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AuthorBook.AUTHOR_BOOK.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return AuthorBook.AUTHOR_BOOK.BOOK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorBookRecord value1(Long value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorBookRecord value2(Long value) {
        setBookId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorBookRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorBookRecord
     */
    public AuthorBookRecord() {
        super(AuthorBook.AUTHOR_BOOK);
    }

    /**
     * Create a detached, initialised AuthorBookRecord
     */
    public AuthorBookRecord(Long authorId, Long bookId) {
        super(AuthorBook.AUTHOR_BOOK);

        set(0, authorId);
        set(1, bookId);
    }
}