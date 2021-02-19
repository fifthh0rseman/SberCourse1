enum ClientType {
    LEGAL_ENTITY{
        LEGAL_ENTITY create (Info info) {
            return new LEGAL_ENTITY(info.name, info.inn, info.iss);
        }
    },
    INDIVIDUAL {
        INDIVIDUAL create (Info info) {
            return new INDIVIDUAL(info.name, info.inn, info.iss);
        }
    },
    HOLDING {
        HOLDING create (Info info) {
            return new HOLDING(info.name, info.inn, info.iss);
        }
    };
    abstract Client create (Info info);
}
