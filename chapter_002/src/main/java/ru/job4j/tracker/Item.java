package ru.job4j.tracker;
/**
* класс Item поля одной заявки.
* @author abobrovitskiy.
*/
public class Item {
	/** id заявки. */
	private String id;
	/** name заявки. */
	private String name;
	/** описание заявки. */
	private String description;
	/** дата создания заявки. */
	private long create;
	/**
	* конструктор по умолчанию.
	*/
	public Item() {
	}
	/**
	* конструктор Item.
	* @param name name.
	* @param description description.
	* @param create create.
	*/
	public Item(String name, String description, long create) {
		this.name = name;
		this.description = description;
		this.create = create;
	}
	/**
	* геттер для name.
	* @return name.
	*/
	public String getName() {
		 return this.name;
	}
	/**
	* геттер для description.
	* @return description.
	*/
	public String getDescription() {
		return this.description;
	}
	/**
	* геттер для create.
	* @return create.
	*/
	public long getCreate() {
		return this.create;
	}
	/**
	* геттер для id.
	* @return id.
	*/
	public String getId() {
		return this.id;
	}
	/**
	* сеттер для id.
	* @param id id.
	*/
	public void setId(String id) {
		this.id = id;
	}
}
