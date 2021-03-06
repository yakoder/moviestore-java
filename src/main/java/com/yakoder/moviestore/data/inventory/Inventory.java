// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDataObject;
import com.yakoder.moviestore.data.movie.Movie;
import com.yakoder.moviestore.data.store.OrderMovie;
import com.yakoder.moviestore.data.store.StoreInventory;

@Entity(name = "inventory")
public class Inventory extends SimpleDataObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4657528220177311161L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inv_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(length = 255)
	private String notes;
	@Column(nullable = false, precision = 10)
	private int quantity;
	@Column(name = "for_sale", nullable = false, length = 3)
	private boolean forSale;
	@Column(name = "num_discs", nullable = false, precision = 10)
	private int numberOfDiscs;
	@Column(name = "have_case_art", nullable = false, length = 3)
	private boolean haveCaseAndArt;
	@Column(name = "is_dual_sided", nullable = false, length = 3)
	private boolean isDualSided;
	@OneToMany(mappedBy = "inventory")
	private Set<ExternalId> externalIds;
	@OneToMany(mappedBy = "inventory")
	private Set<InventoryDigitization> inventoryDigitization;
	@ManyToOne
	@JoinColumn(name = "cond_id")
	private Condition conditions;
	@ManyToOne(optional = false)
	@JoinColumn(name = "movie_id", nullable = false)
	private Movie movies;
	@OneToMany(mappedBy = "inventory")
	private Set<OrderMovie> orderMovies;
	@OneToMany(mappedBy = "inventory")
	private Set<StoreInventory> storeInventory;

	/** Default constructor. */
	public Inventory() {
		super();
	}

	/**
	 * Access method for notes.
	 *
	 * @return the current value of notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * Setter method for notes.
	 *
	 * @param aNotes the new value for notes
	 */
	public void setNotes(String aNotes) {
		notes = aNotes;
	}

	/**
	 * Access method for quantity.
	 *
	 * @return the current value of quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Setter method for quantity.
	 *
	 * @param aQuantity the new value for quantity
	 */
	public void setQuantity(int aQuantity) {
		quantity = aQuantity;
	}

	/**
	 * Access method for forSale.
	 *
	 * @return true if and only if forSale is currently true
	 */
	public boolean isForSale() {
		return forSale;
	}

	/**
	 * Setter method for forSale.
	 *
	 * @param aForSale the new value for forSale
	 */
	public void setForSale(boolean aForSale) {
		forSale = aForSale;
	}

	/**
	 * Access method for numberOfDiscs.
	 *
	 * @return the current value of numberOfDiscs
	 */
	public int getNumberOfDiscs() {
		return numberOfDiscs;
	}

	/**
	 * Setter method for numberOfDiscs.
	 *
	 * @param aNumberOfDiscs the new value for numberOfDiscs
	 */
	public void setNumberOfDiscs(int aNumberOfDiscs) {
		numberOfDiscs = aNumberOfDiscs;
	}

	/**
	 * Access method for haveCaseAndArt.
	 *
	 * @return true if and only if haveCaseAndArt is currently true
	 */
	public boolean isHaveCaseAndArt() {
		return haveCaseAndArt;
	}

	/**
	 * Setter method for haveCaseAndArt.
	 *
	 * @param aHaveCaseAndArt the new value for haveCaseAndArt
	 */
	public void setHaveCaseAndArt(boolean aHaveCaseAndArt) {
		haveCaseAndArt = aHaveCaseAndArt;
	}

	/**
	 * Access method for isDualSided.
	 *
	 * @return true if and only if isDualSided is currently true
	 */
	public boolean isIsDualSided() {
		return isDualSided;
	}

	/**
	 * Setter method for isDualSided.
	 *
	 * @param aIsDualSided the new value for isDualSided
	 */
	public void setIsDualSided(boolean aIsDualSided) {
		isDualSided = aIsDualSided;
	}

	/**
	 * Access method for externalIds.
	 *
	 * @return the current value of externalIds
	 */
	public Set<ExternalId> getExternalIds() {
		return externalIds;
	}

	/**
	 * Setter method for externalIds.
	 *
	 * @param aExternalIds the new value for externalIds
	 */
	public void setExternalIds(Set<ExternalId> aExternalIds) {
		externalIds = aExternalIds;
	}

	/**
	 * Access method for inventoryDigitization.
	 *
	 * @return the current value of inventoryDigitization
	 */
	public Set<InventoryDigitization> getInventoryDigitization() {
		return inventoryDigitization;
	}

	/**
	 * Setter method for inventoryDigitization.
	 *
	 * @param aInventoryDigitization the new value for inventoryDigitization
	 */
	public void setInventoryDigitization(Set<InventoryDigitization> aInventoryDigitization) {
		inventoryDigitization = aInventoryDigitization;
	}

	/**
	 * Access method for conditions.
	 *
	 * @return the current value of conditions
	 */
	public Condition getConditions() {
		return conditions;
	}

	/**
	 * Setter method for conditions.
	 *
	 * @param aConditions the new value for conditions
	 */
	public void setConditions(Condition aConditions) {
		conditions = aConditions;
	}

	/**
	 * Access method for movies.
	 *
	 * @return the current value of movies
	 */
	public Movie getMovies() {
		return movies;
	}

	/**
	 * Setter method for movies.
	 *
	 * @param aMovies the new value for movies
	 */
	public void setMovies(Movie aMovies) {
		movies = aMovies;
	}

	/**
	 * Access method for orderMovies.
	 *
	 * @return the current value of orderMovies
	 */
	public Set<OrderMovie> getOrderMovies() {
		return orderMovies;
	}

	/**
	 * Setter method for orderMovies.
	 *
	 * @param aOrderMovies the new value for orderMovies
	 */
	public void setOrderMovies(Set<OrderMovie> aOrderMovies) {
		orderMovies = aOrderMovies;
	}

	/**
	 * Access method for storeInventory.
	 *
	 * @return the current value of storeInventory
	 */
	public Set<StoreInventory> getStoreInventory() {
		return storeInventory;
	}

	/**
	 * Setter method for storeInventory.
	 *
	 * @param aStoreInventory the new value for storeInventory
	 */
	public void setStoreInventory(Set<StoreInventory> aStoreInventory) {
		storeInventory = aStoreInventory;
	}

	/**
	 * Compares the key for this instance with another Inventory.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class Inventory and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Inventory)) {
			return false;
		}
		Inventory that = (Inventory) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another Inventory.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Inventory))
			return false;
		return this.equalKeys(other) && ((Inventory) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[Inventory |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
