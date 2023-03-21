package org.hibernate.bugs;

import org.hibernate.Hibernate;
import org.hibernate.event.spi.PreLoadEvent;
import org.hibernate.event.spi.PreLoadEventListener;

public class MyPreLoadEventListener implements PreLoadEventListener {

	@Override
	public void onPreLoad(PreLoadEvent event) {
		Hibernate.getClass(event.getEntity());
	}

}
