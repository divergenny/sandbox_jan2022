CREATE TABLE `Workplace` (
   id                  BIGINT                     NOT NULL AUTO_INCREMENT PRIMARY KEY,
   workplaceNumber     BIGINT                     NOT NULL,
   nextToWindow        BOOLEAN                    NOT NULL,
   pc                  BOOLEAN                    NOT NULL,
   monitor             BOOLEAN                    NOT NULL,
   keyboard            BOOLEAN                    NOT NULL,
   mouse               BOOLEAN                    NOT NULL,
   headset             BOOLEAN                    NOT NULL
);

CREATE TABLE `Booking` (
   id                  BIGINT                     NOT NULL AUTO_INCREMENT PRIMARY KEY,
   workplaceId         BIGINT                     NOT NULL,
   userId              BIGINT                     NOT NULL,
   startDate           DATE                       NOT NULL,
   endDate             DATE                       NOT NULL,
   isRecurring         BOOLEAN                    NOT NULL,
   frequency           VARCHAR(50)                NOT NULL,
   createdDate         DATETIME                   NOT NULL,
   modifiedDate        DATETIME                   NOT NULL,
   createdBy           VARCHAR(50)                NOT NULL,
   modifiedBy          VARCHAR(50)                NOT NULL,
   FOREIGN KEY (workplaceId) REFERENCES Workplace(id),
   FOREIGN KEY (userId) REFERENCES User(id)
);