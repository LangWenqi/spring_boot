create table jl_staff (
  id bigint(16) unsigned auto_increment comment '主键',
  uid varchar(8) default '' comment '工号',
  name varchar(16) default '' comment '姓名',
  password varchar(32) default '' comment '密码',
  phone varchar(16) default '' comment '手机号',
  delete_flag tinyint(1) unsigned default 1 comment '删除标记(1:未删除,0:已删除)',
  create_time datetime default current_timestamp() comment '创建时间',
	primary key (id)
) engine=InnoDB auto_increment=10001 default charset=utf8 comment '君联员工表';

create table jl_role (
  id bigint(16) unsigned auto_increment comment '主键',
  role varchar(16) default '' comment '角色',
  description varchar(32) default '' comment '描述',
  delete_flag tinyint(1) unsigned default 1 comment '删除标记(1:未删除,0:已删除)',
  create_time datetime default current_timestamp() comment '创建时间',
  primary key (id)
) engine=InnoDB auto_increment=10001 default charset=utf8 comment '君联角色表';

create table jl_staff_role (
  staff_id bigint(16) unsigned default null COMMENT '关联jl_staff.id',
  role_id bigint(16) unsigned default null COMMENT 'jl_role.id'
) engine=InnoDB auto_increment=10001 default charset=utf8 comment '君联员工角色表';