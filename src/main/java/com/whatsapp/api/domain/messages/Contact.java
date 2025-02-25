package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Full contact information.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {
    /**
     * Optional.
     * <p>
     * YYYY-MM-DD formatted string.
     */
    @JsonProperty("birthday")
    private String birthday;

    @JsonProperty("emails")
    private List<Email> emails;
    /**
     * Optional.
     * <p>
     * Full contact address(es) formatted as an addresses object.
     */
    @JsonProperty("addresses")
    private List<Address> addresses;

    @JsonProperty("urls")
    private List<Url> urls;

    @JsonProperty("org")
    private Org org;

    @JsonProperty("name")
    private Name name;

    @JsonProperty("phones")
    private List<Phone> phones;

    public String getBirthday() {
        return birthday;
    }

    public Contact setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public Contact setEmails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    public Contact addEmails(Email email) {
        if (this.emails == null) this.emails = new ArrayList<>();

        this.emails.add(email);
        return this;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public Contact setAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    public Contact addAddresses(Address address) {
        if (this.addresses == null) this.addresses = new ArrayList<>();

        return this;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public Contact setUrls(List<Url> urls) {
        this.urls = urls;
        return this;
    }

    public Contact addUrls(Url url) {
        if (this.urls == null) this.urls = new ArrayList<>();

        this.urls.add(url);
        return this;
    }

    public Org getOrg() {
        return org;
    }

    public Contact setOrg(Org org) {
        this.org = org;
        return this;
    }

    public Name getName() {
        return name;
    }

    /**
     * @param name {@link Name}
     */
    public Contact setName(Name name) {
        this.name = name;
        return this;
    }


    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * @param phones {@link Phone}
     */
    public Contact setPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    public Contact addPhones(Phone phone) {
        if (this.phones == null) this.phones = new ArrayList<>();


        this.phones.add(phone);
        return this;
    }
}