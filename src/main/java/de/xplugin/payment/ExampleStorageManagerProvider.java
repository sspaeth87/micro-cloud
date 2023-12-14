package de.xplugin.payment;

import one.microstream.enterprise.cluster.nodelibrary.common.ClusterStorageManager;
import one.microstream.enterprise.cluster.nodelibrary.common.spi.ClusterStorageManagerProvider;
import de.xplugin.payment.storage.MicroStream;
import de.xplugin.payment.storage.DataRoot;

public class ExampleStorageManagerProvider implements ClusterStorageManagerProvider
{
	@Override
	public ClusterStorageManager<DataRoot> provideClusterStorageManager()
	{
		return MicroStream.storage();
	}
}
