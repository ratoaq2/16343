package org.hibernate.bugs;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("1")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class EntityB extends ParentEntityB {

	@JoinColumn(name = "ENTITY_C", foreignKey = @ForeignKey(name = "FK_B_TO_C"))
	@ManyToOne
	@Fetch(FetchMode.SELECT)
	EntityC entityC;
}