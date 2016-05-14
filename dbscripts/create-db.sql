-- table declarations :
create table "Users" (
    "id" integer primary key not null,
    "name" varchar(128) not null,
    "acnum" bigint not null,
    "phone" bigint not null
  );
create sequence "s_Users_id";