package com.cellxpert.core.entitiy;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String kind;
    public String totalItems;
    public List<Items> items;

    public class Items {
        public String kind;
        public String id;
        public String selfLink;
        public VolumeInfo volumeInfo;
        public SaleInfo saleInfo;
        public AccessInfo accessInfo;

        public class VolumeInfo {
            public String title;
            public ArrayList<String> authors;
        }

        public class SaleInfo {
            public String country;
            public String saleability;
            public boolean isEbook;
        }

        public class AccessInfo {
            public String country;
            public String viewability;
            public boolean embeddable;
            public boolean publicDomain;
            public String textToSpeechPermission;
            public Epub epub;
            public Pdf pdf;
            public String webReaderLink;
            public String accessViewStatus;
            public boolean quoteSharingAllowed;

            public class Epub {
                public boolean isAvailable;
            }

            public class Pdf {
                public boolean isAvailable;
            }
        }
    }
}
