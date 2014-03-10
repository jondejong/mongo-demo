//dataSource {
//    pooled = true
//    jmxExport = true
//    driverClassName = "org.h2.Driver"
//    username = "sa"
//    password = ""
//}
//hibernate {
//    cache.use_second_level_cache = true
//    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
////    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
//}

grails {
    mongo {
        host = "localhost"
        port = 27017
        username = ""
        password = ""
        databaseName = "people"
    }
}

// environment specific settings
environments {
    development {
        dataSource {
        }
    }
    test {
//        dataSource {
//            dbCreate = "update"
//            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
//        }
    }
    production {
        dataSource {
            }
    }
}
