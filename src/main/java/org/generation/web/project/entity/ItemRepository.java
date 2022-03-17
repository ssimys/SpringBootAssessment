package org.generation.web.project.entity;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.repository.CrudRepository;
// This will be AUTO IMPLEMENTED by Spring
// CRUD refers Create, Read, Update, Delete
public interface ItemRepository extends CrudRepository<AbstractReadWriteAccess.Item, Integer>
{
}



